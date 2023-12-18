import java.util.Scanner;

class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[] s = new String[m];
        String[] c = new String[m];
        for(int i=0; i<m; i++){
            s[i] = scanner.next();
            c[i] = scanner.next();
        }
        scanner.close();
        String[] result = new String[n];
        //初期化
        for(int i=0; i<n; i++){
            result[i] = "";
        }
        for(int i=0; i<m; i++){
            // 2桁以上かつ1桁目が0指定はNG
            if(n>1 && s[i].equals("1") && c[i].equals("0")){
                System.out.println("-1");
                return;
            }
            // 重複はNG
            if(!result[Integer.parseInt(s[i])-1].equals("") && !result[Integer.parseInt(s[i])-1].equals(c[i])){
                System.out.println("-1");
                return;
            }
             result[Integer.parseInt(s[i])-1] = c[i];    
        }
        if(result[0].equals("") && n==1){
            result[0]="0";
        }
        if(result[0].equals("")){
            result[0]="1";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            if(result[i].equals("")){
                result[i]="0";
            }
            sb.append(result[i]);
        }
        System.out.println(sb.toString());

    }
}