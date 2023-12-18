import java.util.*;
public class Main{
  public static void main(String[]args){
  	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String ans = "No";
    
    int []kuku = new int [81];
    int c=0;
    for(int x=1; x<=9; x++){
    	for(int y=1; y<=9; y++){
          kuku[c]=x*y;
          c++;
        }
    }
    for(int i=0; i<81; i++){
    	if(a==kuku[i])ans="Yes";
    }
    
    System.out.println(ans);
  }
}

