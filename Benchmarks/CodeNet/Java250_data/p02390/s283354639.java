class Main{
    
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int t = in.nextInt();
        System.out.println(getFormattedTime(t));
    }
    
    public static String getFormattedTime(int sec){
        int h = sec / 3600;
        int rest_h = sec - h * 3600;
        int m = rest_h / 60;
        int s = rest_h - m * 60; 
        return String.format("%d:%d:%d", h, m, s);
    }
    
}