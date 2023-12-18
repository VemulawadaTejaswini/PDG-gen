import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sn = 0;
        int nclone = n;
        while(nclone!=0){
            sn += nclone%10;
            nclone /= 10;
        }
        if(sn==0) {
            System.out.println("No");
        }else if(n%sn==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}