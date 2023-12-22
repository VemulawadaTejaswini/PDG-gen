import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] O = sc.nextLine().split("");
    String[] E = sc.nextLine().split("");
    String[] result=new String[O.length+E.length];
    
    int i_o=0;
    int i_e=0;
    for(int i=1; i<=O.length + E.length; i++){
      if(i%2!=0){
        System.out.print(O[i_o]);
        i_o++;
      }else{
        System.out.print(E[i_e]);
        i_e++;
      }
    }
  }
}