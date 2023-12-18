import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (true){
            int n=scan.nextInt();
            if (n==0){
                break;
            }
            List<Integer> list=new ArrayList<>();
            int min=1000000;
            for(int i=0;i<n;i++){
                int input=scan.nextInt();
                for(int j=0;j<list.size();j++){
                    int temp=list.get(j)-input;
                    if(temp<0){
                        temp=temp*-1;
                    }
                    if(min>temp){
                        min=temp;
                    }
                }
                list.add(input);
            }
            System.out.println(min);
        }
    }
}
