import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String[] foo = sc.nextLine().split("");
      	int hoge[] = new int[4];
      	for(int i = 0; i < 4; i++) {
      		hoge[i] = Integer.parseInt(foo[i]);
      	}
      	int temp = -1;
      	String str = "Good";
      	for(int i = 0; i < 4; i++){
      		int nabe = hoge[i];
        	if(temp==nabe){
            	str = "Bad";
              	break;
            }
          	temp = nabe;
        }
      
      	System.out.println(str);
    }
}