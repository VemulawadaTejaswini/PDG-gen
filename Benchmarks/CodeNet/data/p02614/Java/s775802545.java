import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h=sc.nextInt(),w=sc.nextInt(),k=sc.nextInt(),ans=0,sum=0;
    char[][] ch=new char[h][w];
    for(int i=0;i<h;i++){
      ch[i]=sc.next().toCharArray();
      for(int j=0;j<w;j++){
        if(ch[i][j]=='#'){
          ans++;
          
        }
      }
    }
    for(int i=0;i<(Math.pow(2,h+w));i++){
      int f=ans;
      char[][] fch=new char[h][w];
      for(int x=0;x<h;x++){
        for(int y=0;y<w;y++){
          fch[x][y]=ch[x][y];
        }
      }
      for(int j=0;j<(h+w);j++){
        if((1&i>>j)==1){
          if(j<h){
            for(int l=0;l<w;l++){
              if(fch[j][l]=='#'){
                fch[j][l]='.';
                f--;
              }
            }
          }else{
            for(int l=0;l<h;l++){
              if(fch[l][j-h]=='#'){
                fch[l][j-h]='.';
                f--;
              }
            }
          }
        }
      }
      if(f==k){
        sum++;
      }
    }
    System.out.println(sum);
  }
}


