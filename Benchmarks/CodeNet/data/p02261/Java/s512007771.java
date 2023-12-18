import java.util.Scanner;

class Main{

    static void print(String[] s){
        for(int i = 0; i < s.length - 1; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println(s[s.length - 1]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        String[] a = new String[n];
        String[] b = new String[n];
        for(int i = 0; i < n; i++){
            String s = sc.next();
            a[i] = s;
            b[i] = s;
        }

        //bubblesort
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j >= i + 1; j--){
                if(a[j].charAt(1) < a[j - 1].charAt(1)){
                    String tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }

        //selectionsort
        for(int i = 0; i < n; i++){
            int minj = i;
            for(int j = i + 1; j < n; j++){
                if(b[j].charAt(1) < b[minj].charAt(1))
                    minj = j;
            }
            String tmp = b[minj];
            b[minj] = b[i];
            b[i] = tmp;
        }

        print(a);
        System.out.println("Stable");

        print(b);
        boolean isStable = true;
        for(int i = 0; i < n; i++){
            if(!a[i].equals(b[i]))
                isStable = false;
        }

        if(isStable){
            System.out.println("Stable");
        }else{
            System.out.println("Not stable");
        }
    }
}


