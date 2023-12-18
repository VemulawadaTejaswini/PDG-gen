import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] l1 = {c/1000, (c/100)%10, (c/10)%10, c%10};
        String[] l2 = {"+", "-"};
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 2;j++){
                for(int k = 0;k < 2;k++){
                    int a = l1[0];
                    if(i == 0)  a += l1[1];
                    else    a -= l1[1];
                    if(j == 0)  a += l1[2];
                    else    a -= l1[2];
                    if(k == 0)  a += l1[3];
                    else    a -= l1[3];
                    if(a == 7){
                        System.out.println(l1[0]+l2[i]+l1[1]+l2[j]+l1[2]+l2[k]+l1[3]+"=7");
                        return;
                    }
                }
            }
        }
    }
}