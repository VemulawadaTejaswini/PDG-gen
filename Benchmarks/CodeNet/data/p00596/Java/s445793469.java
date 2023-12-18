import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num,a,b,c,count,temp;
        count=0;
        boolean[] odd = new boolean[7];
        String str;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.reset();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0));

        //[0-6]がそれぞれいくつあるか数える
        for(int i = 0 ; i < num ; i++){
            str = sc.next();
            a = Integer.parseInt(str.substring(0,1));
            b = Integer.parseInt(str.substring(1,2));
            if(a!=b) {
                temp = list.get(a);
                list.set(a, temp + 1);
                temp = list.get(b);
                list.set(b, temp + 1);
            }
        }
        //それぞれ数えて奇数個あればその数字が分かるようにする
        for(int i=0 ; i<7; i++){
            if(list.get(i)%2!=0){
                odd[i]=true;
                count++;
            }else{
                odd[i]=false;
            }

        }
        //奇数個の数字が2種類あり、かつその2数を持つドミノが存在しなければ、整列させることができる（多分）
        if(count==2){
            c=0;
            str = "";
            for(boolean t: odd){
                if(t){
                    str = str + Integer.toString(c);
                }
                c++;
            }
            if(list.contains(Integer.parseInt(str))){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }else{
            System.out.println("No");
        }
    }
}