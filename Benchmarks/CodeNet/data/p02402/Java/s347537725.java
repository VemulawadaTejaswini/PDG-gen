import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int min = 0,max = 0;
        long sum = 0;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum = sum + a[i];
            if(i != 0){
                if(max < a[i]) max = a[i];
                if(min > a[i]) min = a[i];
            }else {
                min = a[i];
                max = a[i];
            }
        }
        System.out.println(min +" "+ max +" " +sum);
    }
}
