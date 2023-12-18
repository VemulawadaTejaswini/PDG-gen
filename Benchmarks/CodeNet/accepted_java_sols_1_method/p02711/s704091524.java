import java.util.*;	
		
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int num =sc.nextInt();
				 boolean ans=false;
				 for(int i=1;i<=3;i++){
					 if(num%10==7)
						 ans=true;
					 num=num/10;
				 }
				 if(ans){
					 System.out.print("Yes");
				 }else{
					 System.out.print("No");
				 }
  }
}
