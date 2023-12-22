import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        if((x<-100 || 100<x) || (y<-100 || 100<y)){
            System.exit(-1);
        }else if((w<=0 || 100<w) || (h<=0 || 100<h) || (r<=0 || 100<r)){
            System.exit(-1);
        }else if(w<2*r && h<2*r){
            System.out.println("No");
        }else if((r<=x && x<=w-r) && (r<=y && y<=h-r)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}