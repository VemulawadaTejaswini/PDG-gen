import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String no = sc.nextLine();
        String str = sc.nextLine();
        String[] strArraySub = str.split(" ");
        int[] box = new int[strArraySub.length];
        for(int i=0;i<strArraySub.length;i++){
            box[i]=Integer.parseInt(strArraySub[i]);
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<box.length;i++){
            max=Math.max(max, box[i]);
        }

        for(int i=0;i<box.length;i++){
            min=Math.min(min, box[i]);
        }
        System.out.println(max-min);
    }
}