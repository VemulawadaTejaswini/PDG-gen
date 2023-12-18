public class Main {
    pulic Static void Main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        String input = br.readLine();
        int n = Integer.parseInt(input);
        input = br.readLine();
        String[] strArray = input.split(" ");

        for (int i = (n - 1); i >= 0; i--) {
            int x = Integer.parseInt(strArray[i]);
            output.append(x);
            output.append(" ");
        }
        output.append("\n");

        try {
            system.out.print(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}