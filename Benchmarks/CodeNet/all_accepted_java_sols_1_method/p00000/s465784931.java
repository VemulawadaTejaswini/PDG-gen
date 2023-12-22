public class Main{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=9; i++){
            for(int k=1; k<=9; k++){
                sb.append(i).append("x").append(k).append("=").append(i*k).append("\n");
            }
        }
        System.out.print(sb);

    }
}