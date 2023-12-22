import java.util.*;

public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  for(int j=0;j<n;j++){
	  int tri[] = new int[3];
	  for(int i=0;i<3;i++){
		  tri[i]=sc.nextInt();
	  tri[i]*=tri[i];
	  }
	  Arrays.sort(tri);
if(tri[0]+tri[1]==tri[2])
	System.out.println("YES");
else System.out.println("NO");
  }
      }
}