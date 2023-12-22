import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);      
      int sx = sc.nextInt(),sy = sc.nextInt();
      int tx = sc.nextInt(),ty = sc.nextInt();
      int x = tx-sx;
      int y = ty-sy;
      StringBuilder moveList=new StringBuilder();
      for(int i=0;i<y;i++){
       moveList.append("U");
      }
      for(int i=0;i<x;i++){
        moveList.append("R");
      }
      for(int i=0;i<y;i++){
       moveList.append("D");
      }
      for(int i=0;i<x;i++){
        moveList.append("L");
      }
      moveList.append("L");
      for(int i=0;i<y+1;i++){
        moveList.append("U");
      }
      for(int i=0;i<x+1;i++){
       moveList.append("R");
      }
      moveList.append("D");
      moveList.append("R");
      for(int i=0;i<y+1;i++){
        moveList.append("D");
      }
      for(int i=0;i<x+1;i++){
       moveList.append("L");
      }
      moveList.append("U");      
      System.out.println(moveList);
    }
}
