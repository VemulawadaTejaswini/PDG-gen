import java.util.*;

class Main{
    public static void main(String[] args){
        int tmp = -1;
        int max = 0;
        Scanner sc = new Scanner(System.in);

        int blue = sc.nextInt();
        String[] s = new String[blue];
        for(int i=0;i<blue;i++){
            s[i]=sc.next();
        }
        int red = sc.nextInt();
        String[] t  =new String[red];
        for(int i=0;i<red;i++){
            t[i]=sc.next();
        }
        sc.close();

        for(int i=0;i<blue;i++){
            for(int j=0;j<blue;j++){
                if(s[i].equals(s[j])){
                    tmp++;
                }
            }
            for(int k=0;k<red;k++){
                if(s[i].equals(t[k])){
                    tmp--;
                }
            }
            max = Math.max(max,tmp);
            tmp = 0;
        }
        System.out.print(max);
    }
}