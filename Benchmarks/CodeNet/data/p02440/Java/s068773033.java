import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for(int i = 0;i < q;i++){
            int com = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            switch(com){
                case 0:
                    for(int j = b;j < c;j++){
                        if(min > a[j])  min = a[j];
                    }
                    System.out.println(min);
                    break;
                case 1:
                    for(int j = b;j < c;j++){
                        if(max < a[j])  max = a[j];
                    }
                    System.out.println(max);
                    break;
            }
        }
    }
}
