import java.util.*;
//たてH cm よこ W cm の枠を描くプログラム
//H, W がともに 0 のとき、入力の終わり
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
        
    while (sc.hasNextLine()) {
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int i;
        int j;
        
        
if(H == 0 && W == 0){  
          break;
}else{

  for ( i = 0; i < H; i++ ){
    for ( j = 0; j < W; j++ ){
    if( j == 0 || j == W-1 || i == 0 || i == H-1){
        System.out.print("#");
    }else{
        System.out.print(".");
    }
    }        System.out.println("");
  }

}     System.out.println();
}
}
}

