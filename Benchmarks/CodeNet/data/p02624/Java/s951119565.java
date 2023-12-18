import java.util.Scanner;
public class Main{
 public static void main(Strign[] args){
  	Scanner s = new Scanner(System.in);
   	int n = s.nextInt();
   	int result[];
   	int count = 0;
   	for(int i=1;i<=n;i++){
      int j = i;
      while(j-- > 0){
       	if((j/j)==0) 
    		count++;
      }
      int k  =0;
      result[k++] = i * count; 
   }
   int save;
   for(int i=0;i<result.length;i++){
   	save = save + result[i];
   }
   System.out.println(save);
 }
}