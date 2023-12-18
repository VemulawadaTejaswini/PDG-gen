import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
   int n=sc.nextInt();
   int []tri=new int[3];
   for(;n>0;n--){
	   for(int i=0;i<3;i++)tri[i]=sc.nextInt();
	   Arrays.sort(tri);
	   if(tri[2]*tri[2]==tri[0]*tri[0]+tri[1]*tri[1])
		 System.out.println("YES");
	   else System.out.println("NO");
   }
   }
}