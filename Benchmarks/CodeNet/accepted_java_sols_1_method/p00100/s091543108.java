
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

final class Main {

    public static final int MAX_RESULT = 4000;
    public static final int SALE_BORDER = 1000000;

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = inputReader.readLine();
            if (input == null || input.equals("0")) {
                break;
            }
            int count = Integer.parseInt(input);
            HashMap<String, BigInteger> sales =
                    new HashMap<String, BigInteger>();
            ArrayList<String> result = new ArrayList<String>();
            while (count-- > 0) {
                input = inputReader.readLine();
                String[] data = input.split(" ");
                if (!sales.containsKey(data[0])) {
                    sales.put(data[0], BigInteger.ZERO);
                    result.add(data[0]);
                }
                final long sale = Long.parseLong(data[1])
                        * Long.parseLong(data[2]);
                sales.put(data[0],
                        sales.get(data[0]).add(BigInteger.valueOf(sale)));
            }
            for (Entry<String, BigInteger> entry : sales.entrySet()) {
                if (entry.getValue().compareTo(BigInteger.valueOf(SALE_BORDER))
                        < 0) {
                    result.remove(entry.getKey());
                }
            }
            if (result.isEmpty()) {
                System.out.println("NA");
            } else {
                for (String string : result) {
                    System.out.println(string);
                }
            }
        }
    }
}