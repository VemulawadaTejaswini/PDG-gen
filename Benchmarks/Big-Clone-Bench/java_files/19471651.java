public class dummy {
    public static String shaEncode(String val) {
        String output = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(val.getBytes());
            byte[] digest = md.digest();
            output = base64Encode(digest);
        } catch (Exception e) {
        }
        return output;
    }
}
