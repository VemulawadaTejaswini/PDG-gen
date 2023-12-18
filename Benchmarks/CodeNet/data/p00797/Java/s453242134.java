import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Main(); 
    }
   
    public Main() {
        new aoj1217().doIt();
    }
    class aoj1217{
    	String str[] = new String[1001];
    	int array[] = new int[1001];
    	int parent[] = new int[1001];
    	void clear(){
    		for(int i = 0;i < 1001;i++){
    			str[i] = null;
    			array[i] = 0;
    			parent[i] = 0;
    		}
    	}
    	void parents(int n){
    		for(int i = n-1;i > 0;i--){
    			for(int j = i;j >= 0;j--){
    				if(array[i] > array[j]){
    					parent[i] = j;
    					break;
    				}
    			}
    		}
    		parent[0] = -1;
    	}
    	void check(int n){
    		for(int i = 0;i < n;i++){
    			System.out.println(str[i]+" "+array[i]+" "+parent[i]);
    		}
    	}
    	void doIt(){
    		while(true){
    			clear();
    			int n = sc.nextInt();
    			int m = sc.nextInt();
    			if(n + m == 0)break;
    			String s = sc.nextLine();
    			for(int i = 0;i < n;i++){
    				str[i] = sc.nextLine();
    				for(int j = 0;j < 1001;j++){
    					if(str[i].charAt(j) == ' ')array[i]++;
    					else break;
    				}
    				str[i] = str[i].trim();
//    				System.out.println(str[i]+" "+array[i]);
    			}
    			parents(n);
//    			check(n);
    			
    			for(int i = 0;i < m;i++){
    				String spl[] = sc.nextLine().split(" ");
    				spl[5] = spl[5].replace(".", "");
    				if(spl[3].equals("child")){
    					for(int j = 0;j < n;j++){
    						if(str[j].equals(spl[0])){
//    							System.out.println(str[j]+" "+str[parent[j]]+" "+spl[5]);
    							if(str[parent[j]].equals(spl[5])){
    								System.out.println("True");
    							}else{
    								System.out.println("False");
    							}
    							break;
    						}
    					}
    				}else if(spl[3].equals("parent")){
    					for(int j = 0;j < n;j++){
    						if(str[j].equals(spl[5])){
//    							System.out.println(str[j]+" "+str[parent[j]]+" "+spl[5]);
    							if(str[parent[j]].equals(spl[0])){
    								System.out.println("True");
    							}else{
    								System.out.println("False");
    							}
    							break;
    						}
    					}
    				}else if(spl[3].equals("sibling")){
    					String ss = "";
    					String ss2 = "";
    					for(int j = 0;j < n;j++){
    						if(str[j].equals(spl[5])){
    							ss = str[parent[j]];
    						}
    						if(str[j].equals(spl[0])){
    							ss2 = str[parent[j]];
    						}
    					}
    					if(ss.equals(ss2))System.out.println("True");
    					else System.out.println("False");
    				}else if(spl[3].equals("descendant")){
    					String ss = "";
    					int num = 0;
    					for(int j = 0;j < n;j++){
    						if(str[j].equals(spl[0])){
    							ss = str[j];
    							num = j;
    							break;
    						}
    					}
    					while(true){
//    						System.out.println(parent[num]);
    						if(parent[num] == -1){
    							System.out.println("False");
    							break;
    						}
    						if(ss.equals(spl[5])){
    							System.out.println("True");
    							break;
    						}
    						num = parent[num];
    						ss = str[num];
    					}
    				}else if(spl[3].equals("ancestor")){
    					String ss = "";
    					int num = 0;
    					for(int j = 0;j < n;j++){
    						if(str[j].equals(spl[5])){
    							ss = str[j];
    							num = j;
    							break;
    						}
    					}
    					while(true){
    						if(parent[num] == -1){
    							System.out.println("False");
    							break;
    						}
    						if(ss.equals(spl[0])){
    							System.out.println("True");
    							break;
    						}
    						num = parent[num];
    						ss = str[num];
    					}
    				}
    			}
    			System.out.println();
    		}
    	}
    }
}