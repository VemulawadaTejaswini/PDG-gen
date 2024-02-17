public class dummy {
    public void copy(String source, String target) throws IOException {
        targetChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
    }
}
