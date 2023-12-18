import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();// 入力
      	int sum=0;
      
      	for(int i=0;i<n.length();i++){
          sum+=n.charAt(i);
        }
      
      
      	if(sum%9==0){
          System.out.println("yes");
        }else{
          System.out.println("No");
        }
      
    } 
}

















