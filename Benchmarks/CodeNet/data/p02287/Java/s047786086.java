import java.util.*;

public class A{
  Scanner sc = new Scanner(System.in);
  StringBuilder sb = new StringBuilder();

  int H;
  int[] A;

  public static void main(String[] args){
    A main = new A();
    main.in();
    main.out();
  }
  public void in(){
    H = sc.nextInt();
    A = new int[H + 1];
    for(int i = 1;i < A.length;i++){
      A[i] = sc.nextInt();
    }
  }
  public void out(){
    int id;
    for(int i = 1;i < A.length;i++){
      sb.append("node ").append(Integer.toString(i));
      sb.append(": key = ").append(Integer.toString(A[i])).append(", ");

      id = i / 2;
      if(!(id < 1)){
        sb.append("parent key = ").append( Integer.toString(A[id]) ).append(" ");
       
      }
      id = 2 * i;
      if(!(id > H)){
        sb.append("left key = ").append( Integer.toString(A[id])).append(", ");
      }
      id = 2 * i + 1;
      if(!(id > H)){
        sb.append("right key = ").append( Integer.toString(A[id])).append(", ");
      }
      sb.append("\n");
    }
System.out.print(sb.toString());
  }

}
