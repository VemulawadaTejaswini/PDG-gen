import java.util.*;
    public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 整数の入力
            int a = sc.nextInt();
            // スペース区切りの整数の入力
            int b = sc.nextInt();
            int wawana=b;
            int c = sc.nextInt();
            int wana[];
            int costr=0;
            int costl=0;
            wana=new int[wawana];
            for(int i=0;i<b;i++){
                wana[i]=sc.nextInt();
            }

            for(int i=c;i<a;i++){
                for(int gg=0;gg<=wawana-1;gg++){
                    if(i==wana[gg]){
                        costr++;
                    }

                }

            }

            for(int i=c;i>=0;i--){
                for(int gg=0;gg<=wawana-1;gg++){
                    if(i==wana[gg]){
                        costl++;
                    }

                }

            }


            if(costl==costr){
                System.out.println(costl);
            }else if(costl>costr){
                System.out.println(costr);
            }else{
                System.out.println(costl);
            }

            // 文字列の入力

        }
    }