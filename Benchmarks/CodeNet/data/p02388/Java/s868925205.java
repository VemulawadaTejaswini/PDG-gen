class Main {
??public static void main(String[] args) {
????InputStreamReader isr = new InputStreamReader(System.in);
????BufferedReader br = new BufferedReader(isr);
????String buf = br.readLine();
????int x = Integer.parseInt(buf);
????int mp = Math.pow(x, 3);
????System.out.println(mp);
??}
}