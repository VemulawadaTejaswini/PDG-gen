import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
	    InputStreamReader input = new InputStreamReader (System. in);
	    BufferedReader buffer = new BufferedReader(input);
	    String read = buffer.readLine();
    	String[] scan = read.split(" ");

    	ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
    	int userAmount = Integer.parseInt(scan[0]);
    	int connectAmount = Integer.parseInt(scan[1]);

    	int[][] connect = new int[ Integer.parseInt(scan[1]) ][2];
    	for(int i=0; i<connectAmount; i++){
    		read = buffer.readLine();
    		scan = read.split(" ");
    		connect[i][0] = Integer.parseInt(scan[0]);
    		connect[i][1] = Integer.parseInt(scan[1]);
    	}

    	int questionAmount = Integer.parseInt(buffer.readLine());
    	int[] question = new int[2];
    	for(int Q=0; Q<questionAmount; Q++){
        	read = buffer.readLine();
        	scan = read.split(" ");
        	question[0] = Integer.parseInt(scan[0]);
        	question[1] = Integer.parseInt(scan[1]);
        	boolean[] visitedUser = new boolean[userAmount];
        	boolean reachAble = false;
        	stack.addFirst(question[0]);

        	while(true){	//?§????????????±???????????¢?´¢
        		boolean isBranch = false;
        		int serching = stack.peek();
        		if(serching == question[1]){	//?????????????????????????????????????????????????????????Yes
//        			System.out.println("reach!");
        			reachAble = true;
        			break;
        		}
        		for(int i=0; i<connectAmount; i++){	//???????????????????????????????????£????????¨???????????????????????\?????????
        			if( connect[i][0] == serching && visitedUser[connect[i][1]] == false ){
        				stack.addFirst(connect[i][1]);
        				visitedUser[connect[i][1]] = true;
        				isBranch = true;
        			}
        		}
        		if(isBranch == false){
        			stack.poll();
        			if(stack.isEmpty()){
        				break;
        			}
        		}
        	}


        	stack.addFirst(question[1]);
        	while(true){		//??????????????±?????¢?´¢
        		boolean isBranch = false;
        		int serching = stack.peek();
        		if(serching == question[0]){	//?????????????????????????????????????????????????????????Yes
//        			System.out.println("reach!");
        			reachAble = true;
        			break;
        		}
        		for(int i=0; i<connectAmount; i++){	//???????????????????????????????????£????????¨???????????????????????\?????????
        			if( connect[i][1] == serching && visitedUser[connect[i][0]] == false ){
        				stack.addFirst(connect[i][0]);
        				visitedUser[connect[i][0]] = true;
        				isBranch = true;
        			}
        		}
        		if(isBranch == false){
        			stack.poll();
        			if(stack.isEmpty()){
        				break;
        			}
        		}
        	}

        	if(reachAble == true){
        		System.out.println("yes");
        	}
        	else{
        		System.out.println("no");
        	}
    	}
	}
}