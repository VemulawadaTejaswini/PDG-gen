import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        // TODO ?????????????????????????????????????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        //int input = 0;
        char[] input = new char[16];
        for(int i = 0; i < 4; i++){
            String[] tmpStr = br.readLine().split(" ");
            for(int j = 0; j < 4; j++){
                int number = Integer.parseInt(tmpStr[j]);
                //?????????????????\???????????§0???9???????????????
                if(number == 0){
                    number = 16;
                }
                input[i*4+j] = (char)(number+'a');
            }
        }
        //???????????????????????????
        ////System.out.println(swapTiles(123496758, DOWN));
        /*
        boolean[] tmpResult = checkAvailable(921436795);
        if(tmpResult[UP]){
        	//System.out.println("UP OK");
        }
        if(tmpResult[RIGHT]){
        	//System.out.println("RIGHT OK");
        }
        if(tmpResult[DOWN]){
        	//System.out.println("DOWN OK");
        }
        if(tmpResult[LEFT]){
        	//System.out.println("LEFT OK");
        }
        */
        
        //System.out.println(new String(input));
        
        searchPathByBFS(input);
        ////System.out.println("END");
        System.out.println(minimumTurn.get("bcdefghijklmnopq"));
    }
    
     
    static int call = 0;
    static void recursiveTest(int depth){
        char[][] test = new char[3][3];
         
        call++;
        //System.out.println("depth is "+depth+" call "+call);
        if(depth == 32){
            return;
        }
        recursiveTest(depth + 1);
        recursiveTest(depth + 1);
        recursiveTest(depth + 1);
        recursiveTest(depth + 1);
    }
    
    static HashMap<String, Integer> minimumTurn = new HashMap<String, Integer>();
    static final String finish = "bcdefghijklmnopq";
    static int currentMin = Integer.MAX_VALUE;
    
    static int searchPathByBFS(char[] condition){
    	//ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>();
   		ArrayList<String> array = new ArrayList<String>();
   		array.add(new String(condition));
   		minimumTurn.put(new String(condition), 0);
   		if(new String(condition).equals(finish)){
   			return 1;
   		}
   		
   		int depth = 1;
    	int[] dirArray = {UP, RIGHT, DOWN, LEFT};
    	
    	while (true){
    		//System.out.println("depth = "+depth+" hashsize = "+minimumTurn.size());
    		ArrayList<String> tmpArray = new ArrayList<String>();
    		
    		//char[] nextCondition;
    		for(int i = 0 ; i < array.size() ; i++){
    			boolean[] available = checkAvailable(array.get(i).toCharArray());
    			//System.out.printf("Available %b %b %b %b\n", available[0], available[1], available[2], available[3]);
    			//System.out.println("i = "+i);
    			int result = 0;

    			//?????????????????????????????§??????
    			for(int j = 0; j < dirArray.length ; j++){
    				if(available[j]){
    					//System.out.println("j = "+j);
    					char[] condClone = array.get(i).toCharArray();
    					String tmp = swapTiles(condClone, dirArray[j]);
    					String condString = new String(tmp);
    					if(!minimumTurn.containsKey(condString)){
    						minimumTurn.put(condString, depth);
    					}

    					//????§?????????????????????§??????
    					else {
    						//System.out.println("MUDAMUDAAAAAA");
    						continue;
    					}
    					if(condString.equals(finish)){
    						return 1;
    					}

    					tmpArray.add(tmp);
    				}
    			}
    		}
    		depth++;
    		array = tmpArray;
    		if(array.size() == 0){
    			break;
    		}
    		/*
    		for(int i = 0; i < array.size(); i++){
    			System.out.println("array "+i+" "+array.get(i));
    		}*/
    	}
    	
    	//???????????§??\?????¨???????????¨????§£??????????????????
    	return 0;
    }
    
    static int searchPath(char[] condition, int depth, int direction){
    	//?????§??????????????£?????????????????±??????????????????
    	if(depth >= currentMin || depth >= 32){
    		return 0;
    	}
    	//??????????\?
    	if(direction != START){
    		swapTiles(condition, direction);
    	}
    	
    	String condStr = new String(condition);
    	//System.out.println(condStr+" depth = "+depth + " hash size "+ minimumTurn.size());
    	if(!minimumTurn.containsKey(condStr) || minimumTurn.get(condStr) > depth){
    		minimumTurn.put(condStr, depth);
    	}
    	
    	//????§?????????????????????§??????
    	else if(minimumTurn.get(condStr) <= depth){
    		return 0;
    	}
    	
    	//??¢?´¢?????????????????§??????
    	if(condStr.equals(finish)){
    		///System.exit(0);
    		//System.out.println("FINISH!!");
    		currentMin = depth;
    		return 1;
    	}
    	boolean[] available = checkAvailable(condition);
    	////System.out.printf("Available %b %b %b %b\n", available[0], available[1], available[2], available[3]);
    	int result = 0;
    	
    	//???
    	if(direction != DOWN && available[UP]){
    		////System.out.println("GO TO UP");
    		char[] condClone = Arrays.copyOf(condition, condition.length);
    		searchPath(condClone, depth + 1, UP);
    	}
    	//???
    	if(direction != LEFT && available[RIGHT]){
    		////System.out.println("GO TO LEFT");
    		char[] condClone = Arrays.copyOf(condition, condition.length);
    		searchPath(condClone, depth + 1, RIGHT);
    	}
    	//???
    	if(direction != UP && available[DOWN]){
    		////System.out.println("GO TO DOWN");
    		char[] condClone = Arrays.copyOf(condition, condition.length);
    		searchPath(condClone, depth + 1, DOWN);
    	}
    	//???
    	if(direction != RIGHT && available[LEFT]){
    		////System.out.println("GO TO LEFT");
    		char[] condClone = Arrays.copyOf(condition, condition.length);
    		searchPath(condClone, depth + 1, LEFT);
    	}
    	return 0;
    }
    
    private static String swapTiles (char[] condition, int direction){
    	
    	int index16 = new String(condition).indexOf('a'+16);
    	int targetIndex;
    	if(direction == UP){
    		targetIndex = index16 - 4;
    	}
    	else if(direction == RIGHT){
    		targetIndex = index16 + 1;
    	}
    	else if(direction == DOWN){
    		targetIndex = index16 + 4;
    	}
    	else{
    		targetIndex = index16 - 1;
    	}
    	//System.out.println("direction "+direction+" index16 "+index16+" targetIndex"+targetIndex);
    	
    	char tmp = condition[index16];
    	condition[index16] = condition[targetIndex];
    	condition[targetIndex] = tmp;
    			
    	return new String(condition);
//    	return condition;
    }
    
    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;
    static final int START = 4;
    
    private static boolean[] checkAvailable(char[] condition){
    	boolean [] result = new boolean[4];
    	Arrays.fill(result, true);
    	
    	String condStr = new String(condition);
    	int index16 = condStr.indexOf('a'+16);
    	////System.out.println("index16 = "+ index16);
    	if(index16 == 0 || index16 == 1 || index16 == 2 || index16 == 3){
    		result[UP] = false;
    	}
    	if(index16 == 3 || index16 == 7 || index16 == 11 || index16 == 15){
    		result[RIGHT] = false;
    	}
    	if(index16 == 12 || index16 == 13 || index16 == 14 || index16 == 15){
    		result[DOWN] = false;
    	}
    	if(index16 == 0 || index16 == 4 || index16 == 8 || index16 == 12){
    		result[LEFT] = false;
    	}
    	
    	return result;
    }
 
}