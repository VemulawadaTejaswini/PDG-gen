import java.util.*;

public class Main {

    static int a,b;


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0&&b==0){
                break;
            }
            int sum = 0;
            for(int i=1;i<=a-2;i++){
                for(int j=i+1;j<=a-1;j++){
                    for(int k=j+1;k<=a;k++){
                        if(i+j+k==b){
                            sum++;
                        }
                    }
                }
            }
            list.add(sum);
        }
        sc.close();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}

