import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = Integer.parseInt(str);

        int h_point = 0,t_point = 0;

        for(int i = 0;i < n;i++){
            String taro = sc.next();
            String hanako = sc.next();
            if(taro.compareTo(hanako) > 0)  t_point += 3;
            else if(taro.compareTo(hanako) < 0) h_point += 3;
            else{
                t_point++;
                h_point++;
            }
        }
        System.out.println(t_point+" "+h_point);
    }
}
