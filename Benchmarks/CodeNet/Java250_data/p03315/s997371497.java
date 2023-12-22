import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] kigo = str.split("");
        int sum=0;
        for(int i=0;i<kigo.length;i++){
            if(kigo[i].equals("+")){
                sum=sum+1;
            }else{
                sum=sum-1;
            }
        }
        System.out.println(sum);
    }
}