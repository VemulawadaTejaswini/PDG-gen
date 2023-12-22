import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char [][] s = new char[h][w];
      for(int i=0;i<h;i++){
        String str = sc.next();
        for(int j=0;j<w;j++){
          s[i][j] = str.charAt(j);
        }
      }
      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          if(s[i][j]=='.'){
            int count=0;
            for(int k=i-1;k<i+2;k++){
              for(int l=j-1;l<j+2;l++){
                if(0<=k && k<h && 0<=l && l<w){
                  if(s[k][l]=='#'){
                    count++;
                  }
                }
              }
            }
            s[i][j]=(char)(count+48);
          }
        }
      }
     for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          System.out.print(s[i][j]);
        }
       System.out.println();
      }
    }
}
