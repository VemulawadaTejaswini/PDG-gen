import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        String S = sc.next();
        int offset;
        StringBuilder sb = new StringBuilder();
        for(int i=N;i>0;i=offset){
            offset = Math.max(0,i-M);
            for(;offset<i;offset++){
                if(S.charAt(offset)=='0'){
                    break;

                }
            }
            if(offset==i){
                System.out.print(-1);
                System.out.flush();
                return ;
            }else{
                sb.insert(0," "+(i-offset));
            }
        }

        System.out.print(sb.subSequence(1,sb.length()));
    }
}