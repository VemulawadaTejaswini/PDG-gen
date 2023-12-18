import java.util.*;

public class Main {
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);

    String n=sc.next();
    String a[]=n.split("");
    int count=0;

    for(int i=0;i<3;i++){
      if(a[i].equals(a[i+1])){
        count++;
      }else{
        if(count<=1){
          count=0;
        }
      }
    }

    if(count>=2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

	}
}
