import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        String[] str = S.split("", -1);
        for (int i=0;i<N;i++){
            if(i==K-1){
                if(str[i].equals("A")){
                    System.out.print("a");
                } else if (str[i].equals("B")){
                    System.out.print("b");
                } else if (str[i].equals("C")){
                    System.out.print("c");
                }
            }else{
                System.out.print(str[i]);
            }
        }
        sc.close();
    }
}