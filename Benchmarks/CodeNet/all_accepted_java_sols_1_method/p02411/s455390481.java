import java.util.*;

class Main {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int test1,test2,test3;  //中間試験点数、期末試験点数、再試験点数
        int sum;    //中間試験、期末試験合計点数
        
        while(true){
            test1 = sc.nextInt();
            test2 = sc.nextInt();
            test3 = sc.nextInt();

            //終了条件
            if(test1 == -1 && test2 == -1 && test3 == -1)   break;

            //どちらか欠席の場合
            if(test1 == -1 || test2 == -1)  System.out.println("F");
            else{
                sum = test1 + test2;
                if(sum >= 80)   System.out.println("A");
                else if(sum >= 65)  System.out.println("B");
                else if(sum >= 50)  System.out.println("C");
                else if(sum >= 30){
                    if(test3 >= 50) System.out.println("C");
                    else    System.out.println("D");
                }
                else    System.out.println("F");
            }
        }
    }
}

