class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new java.io.InputStreamReader(System.in));
        {
            try {
                String s =in.readLine();
                StringTokenizer st;
                while(s!=null)
                {
                    st = new StringTokenizer(s);
                    int p =Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ;
                     
                    System.out.println((int)Math.log10(p)+1);
                    s =in.readLine();
                }
            } catch (Exception ex) {
                System.exit(0);
            }
     }
    
}
}