import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        String str[] = new String[h];
        for (int i=0; i<h; i++){
            str[i] = sc.next();
        }

        int point[][] = new int[h][w];

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                point[i][j] = str[i].charAt(j);
            }
        }

        int height[][] = new int[h][w];
        int width[][] = new int[h][w];


        for (int i=0; i<w; i++){
            for (int j=0; j<h; j++){
                if (point[j][i]=='.'){
                    int tmp = j;
                    while(true){
                        j++;
                        if (j>=h || point[j][i]=='#'){
                            int ans = j - tmp;
                            for (int k=tmp; k<j; k++){
                                height[k][i] = ans;
                            }
                            break;
                        }
                    }
                }
            }
        }

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                if (point[i][j]=='.'){
                    int tmp = j;
                    while(true){
                        j++;
                        if (j>=w || point[i][j]=='#'){
                            int ans = j - tmp;
                            for (int k=tmp; k<j; k++){
                                width[i][k] = ans;
                            }
                            break;
                        }
                    }
                }
            }
        }

        int ans = 0;

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                ans = Math.max(ans, (height[i][j]+width[i][j]));
            }
        }
        System.out.println(ans-1);

    }
}
