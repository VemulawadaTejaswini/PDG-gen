import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String Tile = sc.next();
    char Tiles[]= new char[Tile.length()];
    int count=0;
    for(int i=0;i<Tile.length();i++){
       Tiles[i]=Tile.charAt(i);
    }
    for(int i=1;i<Tile.length();i++){
         if(Tiles[i]==Tiles[i-1]){
           count++;
         if(Tiles[i]=='0'){
         Tiles[i]='1';
         }else if (Tiles[i]=='1'){
         Tiles[i]='0';
         }
    	}
    }
      System.out.print(count); 
  }
}