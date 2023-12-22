import java.util.Scanner;
class Main{
    int n,x,y;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\s");
        n = sc.nextInt();
        int a[][] = new int [14][4];
        for(x = 0; x < 13; x++){
            for(y = 0; y < 4; y++){
                a[x][y] = 0;
            }
        }
        for(x = 0; x < n; x++){
            String b = sc.next();
            int c = sc.nextInt();
            if(b.equals("S")){
                a[c][0] = c;
            }else if(b.equals("H")){
                a[c][1] = c;
            }else if(b.equals("C")){
                a[c][2] = c;
            }else if(b.equals("D")){
                a[c][3] = c;
            }
        }
        for(y = 0; y < 4; y++){
            for(x = 1; x < 14; x++){
                if(a[x][y] == 0 && y == 0){
                    System.out.println("S " + x);
                }else if(a[x][y] == 0 && y == 1){
                    System.out.println("H " + x);
                }else if(a[x][y] == 0 && y == 2){
                    System.out.println("C " + x);
                }else if(a[x][y] == 0 && y == 3){
                    System.out.println("D " + x);
                }else{
                    continue;
                }
            }
         }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}