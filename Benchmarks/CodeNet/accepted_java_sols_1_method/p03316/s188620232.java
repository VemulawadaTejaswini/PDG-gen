import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int suu = Integer.parseInt(str);
        String[] num = str.split("");
        int sum =0;
        for(int i=0;i<num.length;i++){
            sum=sum+Integer.parseInt(num[i]);
        }
        if(suu%sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}