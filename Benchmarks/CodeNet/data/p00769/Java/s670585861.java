import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1149().doIt();
    }
    class aoj1149{
    	int dfs(int deep,String str){
    		int result = 0;
    		if (Character.isDigit(str.charAt(0))) {
                return Integer.valueOf(str)/2 + 1;
            }
    		ArrayList<Integer> array = new ArrayList<Integer>();
    		int poss = 0;
    		int num = 0;
    		for(int i = 0;i < str.length();i++){
    			if(str.charAt(i)== '['){
    				poss++;
    			}
    			else if(str.charAt(i) == ']'){
    				poss--;
    			}
    			if(poss == 0){
    				array.add(dfs(deep+1,str.substring(num + 1, i)));
    				num = i + 1;
    			}
    		}
    		Collections.sort(array);
//    		System.out.println(array.toString()+" "+deep);
    		for(int i = 0;i < array.size()/2 + 1;i++){
    			result = result + array.get(i);
    		}
    		return result;
    	}
        void doIt(){
        	int n = sc.nextInt();
        	for(int i = 0;i < n;i++){
        		String str = sc.next();
        		System.out.println(dfs(0,str));
        	}
        }
     }
}