import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
   for(;;){
   int a=0;
   int turi=1000-sc.nextInt();
   if(turi==1000)break; 
   a+= turi/500;
   a+=turi%500/100;
   a+=turi%500%100/50;
   a+=turi%500%100%50/10;
   a+=turi%500%100%50%10/5;
   a+=turi%500%100%50%10%5;
  System.out.println(a);
   }
   }
}