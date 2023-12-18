import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //リスト定義
        ArrayList<Integer> A = new ArrayList<Integer>();
        
        int num = sc.nextInt();
        
        int number = 0,order;
        for(int i = 0;i < num;i++){
            //命令変数定義
            order = sc.nextInt();;
            //条件定義
            switch(order){
                //pushBack
                case 0:
                    number = sc.nextInt();
                    A.add(number);
                    break;
                //randomAccess
                case 1:
                    number = sc.nextInt();
                    System.out.println(A.get(number));
                    break;
                //popBack
                case 2:
                    A.remove(A.size() - 1);
                    break;
            }
        }
    }
}
