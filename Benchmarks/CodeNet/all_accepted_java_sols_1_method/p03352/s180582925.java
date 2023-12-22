import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = Integer.parseInt(str);
        double max = 0;

        for(int i=1;i<=num;i++){
            if(num==1){
                max=1;
                break;
            }
            for(int j=2;j<num;j++){
                if(Math.pow(i, j)>num){
                    break;
                }
                max = Math.max(max, Math.pow(i, j));
            }
        }
        System.out.println((int)max);
    }
}