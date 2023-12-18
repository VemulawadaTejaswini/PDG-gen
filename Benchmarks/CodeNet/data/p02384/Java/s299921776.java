import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int d1, d2, d3, d4, d5, d6;
        d1 = scn.nextInt();
        d2 = scn.nextInt();
        d3 = scn.nextInt();
        d4 = scn.nextInt();
        d5 = scn.nextInt();
        d6 = scn.nextInt();
        int n = scn.nextInt();
        int top, front;
        for(int i=0;i<n;i++){
            top = scn.nextInt();
            front = scn.nextInt();

            if(top==d1||top==d6){
              int cube[] = {d4, d2, d3, d5};
              int temp ;
              if(top==d1){
                  temp=1;
              }else{
                  temp=-1;
              }
              for(int j=0;j<4;j++){
                  if(cube[j]==front){
                      int t = j+temp;
                      if(t<0){
                          t=3;
                      }else if(t>3){
                          t=0;
                      }
                      System.out.println(cube[t]);
                  }
                }
            }
            if(top==d2||top==d5){
                int cube[] = {d6, d3, d1, d4};
                int temp ;
                if(top==d2){
                    temp=1;
                }else{
                    temp=-1;
                }
                for(int j=0;j<4;j++){
                    if(cube[j]==front){
                        int t = j+temp;
                        if(t<0){
                            t=3;
                        }else if(t>3){
                            t=0;
                        }
                        System.out.println(cube[t]);
                    }
                }
            }
            if(top==d3||top==d4){
                int cube[] = {d1, d2, d6, d5};
                int temp ;
                if(top==d3){
                    temp=1;
                }else{
                    temp=-1;
                }
                for(int j=0;j<4;j++){
                    if(cube[j]==front){
                        int t = j+temp;
                        if(t<0){
                            t=3;
                        }else if(t>3){
                            t=0;
                        }
                        System.out.println(cube[t]);
                    }
                }
            }



        }



     scn.close();

    }


}
