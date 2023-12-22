import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int i,j;
        int ans = 0;
        String aa,bb;
        String hw[][] = new String[h][k];
        String check[] = new String[6];
        String check2[] = new String[6];
      
        for(i = 0;i < h;i++){
          hw[i] = sc.next().split("");
        }
      
        int retu = (int)Math.pow(2,h);
        int gyou = (int)Math.pow(2,w);
      
		for(i = 0;i < retu;i++){
          for(j = 0;j < gyou;j++){
			count = 0;
            
            for(int tate = 0;tate < h;tate++){
              for(int yoko = 0;yoko < w;yoko++){
                if(hw[tate][yoko].equals("#") && ((i >> tate) & 1) == 0
                  && ((j >> yoko) & 1) == 0){
                  count += 1;
                }
              }
            }
            if(count == k){
              ans += 1;
            }
            
            
          }
        }
        
        
        System.out.println(ans);
               
    }
}