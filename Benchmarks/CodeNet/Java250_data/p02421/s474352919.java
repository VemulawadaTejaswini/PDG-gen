import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int pointA = 0;
        int pointB = 0;

        for(int i=0;i<n;i++){
            String strA = sc.next();
            String strB = sc.next();
            sc.nextLine();

            switch (compString(strA, strB)){
                case 1:
                    pointA += 3;
                    break;
                case -1:
                    pointB +=3;
                    break;
                case 0:
                    pointA++;
                    pointB++;
                    break;
            }
        }
        System.out.printf("%d %d\n", pointA, pointB);
        sc.close();
    }
    static int compString(String a, String b){
        if(a.equals(b)){
            return 0;
        }
        
        int len = a.length() < b.length() ? a.length() : b.length();
        for(int i=0;i<len;i++){
            if(a.charAt(i)>b.charAt(i)){
                return 1;
            }else if(a.charAt(i)<b.charAt(i)){
                return -1;
            }
        }

        if(a.length()>b.length()){
            return 1;
        }else{
            return -1;
        }
    }
}
