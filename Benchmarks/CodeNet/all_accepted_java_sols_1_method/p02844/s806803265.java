import java.util.*;

class Main{
    //ABC107C
    static final int DIV = 100000007;
    static final int MAX = 2000000000;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();
        int ans=0;
        for(int a = 0;a<10;a++){
            for(int b = 0;b<10;b++){
                for(int c = 0;c<10;c++){
                    int i,j,k;
                    for(i=0;i<n;i++){
                        if(str[i]==a+48)break;     
                    }                   
                    for(j=i+1;j<n;j++)if(str[j]==b+48){
                        break;
                    }
                    for(k=j+1;k<n;k++){
                        if(str[k]==c+48){
                            ans++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}