import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int sam = a+b+c;
      	int kake = a*b*c;
      	
     
		if(sam==17&&kake==175){
		System.out.print("YES");
        }else{
          System.out.print("NO");
        }
      
    }
}