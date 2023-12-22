import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int ap=0;
      int bp=0;
      for(int i=0; i<n; i++){
    	  String a=sc.next();
    	  String b=sc.next();
    	  if(a.compareTo(b)>0){
    		  ap+=3;
    	  }else if(a.compareTo(b)==0){
    		  ap++;
    		  bp++;
    	  }else{
    		  bp+=3;
    	  }
      }
      System.out.println(ap+" "+bp);

    }
}
