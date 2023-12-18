import java.util.*;

class Main {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int limit;  //n
        int answer; //正解の合計
        int count  = 0;  //組み合わせ数

        while(true){
            limit = sc.nextInt();
            answer = sc.nextInt();

            if(limit == 0 && answer == 0)   break;
            count = 0;
            for(int i = 1;i <= limit - 2;i++){
                for(int j = i + 1;j <= limit - 1;j++){
                    for(int k = j + 1;k <= limit;k++){
                        if((i+j+k) == answer) count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

